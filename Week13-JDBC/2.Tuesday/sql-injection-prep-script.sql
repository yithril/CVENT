-- Add the SSN column
ALTER TABLE Employees
ADD COLUMN SSN VARCHAR(11);

-- Update the SSN column with random values
UPDATE Employees
SET SSN = LPAD((FLOOR(RANDOM() * 900) + 100)::TEXT, 3, '0') || '-' || 
           LPAD((FLOOR(RANDOM() * 90) + 10)::TEXT, 2, '0') || '-' || 
           LPAD((FLOOR(RANDOM() * 9000) + 1000)::TEXT, 4, '0');