import AWS from 'aws-sdk';
const { S3 } = AWS;

const s3 = new S3();

export const handler = async (event) => {
    console.log('Event received:', JSON.stringify(event, null, 2));

    const sourceBucket = event.Records[0].s3.bucket.name;
    const sourceKey = decodeURIComponent(event.Records[0].s3.object.key.replace(/\+/g, ' '));
    //PUT THE DESTINATION BUCKET NAME HERE
    const destinationBucket = 'lambdaexperimentbucketoutput';
    const destinationKey = `processed-${sourceKey}`;

    try {
        // Get the object from the source bucket
        const params = {
            Bucket: sourceBucket,
            Key: sourceKey,
        };
        const { Body } = await s3.getObject(params).promise();

        // Put the object in the destination bucket with a modified name
        const putParams = {
            Bucket: destinationBucket,
            Key: destinationKey,
            Body: Body,
        };
        await s3.putObject(putParams).promise();

        console.log(`Successfully copied ${sourceKey} from ${sourceBucket} to ${destinationBucket} with new name ${destinationKey}`);

        return {
            statusCode: 200,
            body: JSON.stringify('File processed successfully'),
        };
    } catch (error) {
        console.error(`Error processing object ${sourceKey} from bucket ${sourceBucket}.`, error);

        return {
            statusCode: 500,
            body: JSON.stringify('Error processing file'),
        };
    }
};