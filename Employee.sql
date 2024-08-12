USE DAY1
CREATE TABLE Employee (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    date_of_birth DATE NOT NULL,
    role VARCHAR(255) NOT NULL
);
INSERT Employee VALUES ( N'Chy', 20, CAST(N'2004-09-30' AS Date), N'Developer'),
		( N'Moi', 20, CAST(N'2004-03-12' AS Date), N'Developer'),
		( N'Bao', 20, CAST(N'2004-07-04' AS Date), N'Test')
