import axios from 'axios';

const apiKey = import.meta.env.VITE_API_KEY;
const apiUrl = 'https://api.api-ninjas.com/v1/nutrition';

const nutritionApiInstance = axios.create({
  baseURL: apiUrl,
  headers: {
    'Content-Type': 'application/json',
    'X-Api-Key': apiKey,
  },
});

export default nutritionApiInstance;