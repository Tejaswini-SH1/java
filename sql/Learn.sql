CREATE DATABASE LEARN;
USE LEARN;
CREATE TABLE IndianMoviess (MovieID INT PRIMARY KEY,Title VARCHAR(100) NOT NULL,Director VARCHAR(100),ReleaseYear INT,Rating DECIMAL(3, 1),
    CONSTRAINT check_releaseyear CHECK (ReleaseYear > 1900),
    CONSTRAINT check_rating CHECK (Rating >= 0 AND Rating <= 10)
);

INSERT INTO IndianMoviess (MovieID, Title, Director, ReleaseYear, Rating) VALUES
(1, 'Lagaan', 'Ashutosh Gowariker', 2001, 8.1),
(2, '3 Idiots', 'Rajkumar Hirani', 2009, 8.4),
(3, 'Dangal', 'Nitesh Tiwari', 2016, 8.3),
(4, 'Bahubali', 'S. S. Rajamouli', 2015, 8.2),
(5, 'Gully Boy', 'Zoya Akhtar', 2019, 7.9);
ALTER TABLE IndianMoviess ADD CONSTRAINT unique_title UNIQUE (Title);

ALTER TABLE IndianMoviess DROP CONSTRAINT unique_title;

ALTER TABLE IndianMoviess ADD CONSTRAINT check_releaseyear_range CHECK (ReleaseYear <= 2023);

ALTER TABLE IndianMoviess DROP CONSTRAINT check_releaseyear_range;

CREATE TABLE IndianDishes (DishID INT PRIMARY KEY,Name VARCHAR(100) NOT NULL,Cuisine VARCHAR(50),SpicinessLevel INT,Price DECIMAL(10, 2),
    CONSTRAINT check_spiciness CHECK (SpicinessLevel BETWEEN 1 AND 10),
    CONSTRAINT check_price CHECK (Price > 0)
);

INSERT INTO IndianDishes (DishID, Name, Cuisine, SpicinessLevel, Price) VALUES
(1, 'Biryani', 'Hyderabadi', 8, 250.00),
(2, 'Butter Chicken', 'Punjabi', 5, 300.00),
(3, 'Dosa', 'South Indian', 3, 100.00),
(4, 'Rogan Josh', 'Kashmiri', 7, 350.00),
(5, 'Paneer Tikka', 'North Indian', 4, 200.00);


ALTER TABLE IndianDishes ADD CONSTRAINT unique_name UNIQUE (Name);

ALTER TABLE IndianDishes DROP CONSTRAINT unique_name;

ALTER TABLE IndianDishes ADD CONSTRAINT check_price_limit CHECK (Price <= 1000);

ALTER TABLE IndianDishes DROP CONSTRAINT check_price_limit;

CREATE TABLE IndianFestivals (FestivalID INT PRIMARY KEY,Name VARCHAR(100) NOT NULL,Month VARCHAR(50),DurationDays INT,CelebratedIn VARCHAR(100),
    CONSTRAINT check_duration CHECK (DurationDays > 0)
);

INSERT INTO IndianFestivals (FestivalID, Name, Month, DurationDays, CelebratedIn) VALUES
(1, 'Diwali', 'October-November', 5, 'All India'),
(2, 'Holi', 'March', 2, 'All India'),
(3, 'Durga Puja', 'September-October', 10, 'West Bengal'),
(4, 'Ganesh Chaturthi', 'August-September', 10, 'Maharashtra'),
(5, 'Pongal', 'January', 4, 'Tamil Nadu');



ALTER TABLE IndianFestivals ADD CONSTRAINT unique_festival_name UNIQUE (Name);

ALTER TABLE IndianFestivals DROP CONSTRAINT unique_festival_name;

ALTER TABLE IndianFestivals ADD CONSTRAINT check_month_length CHECK (LENGTH(Month) >= 3);

ALTER TABLE IndianFestivals DROP CONSTRAINT check_month_length;

CREATE TABLE Landmarks (LandmarkID INT PRIMARY KEY,Name VARCHAR(100) NOT NULL,Location VARCHAR(100),YearBuilt INT,EntryFee DECIMAL(10, 2),
    CONSTRAINT check_year_built CHECK (YearBuilt > 0),
    CONSTRAINT check_entry_fee CHECK (EntryFee >= 0)
);
INSERT INTO Landmarks (LandmarkID, Name, Location, YearBuilt, EntryFee) VALUES
(1, 'Taj Mahal', 'Agra', 1653, 50.00),
(2, 'Qutub Minar', 'Delhi', 1193, 30.00),
(3, 'Gateway of India', 'Mumbai', 1924, 0.00),
(4, 'Mysore Palace', 'Mysore', 1912, 40.00),
(5, 'Charminar', 'Hyderabad', 1591, 20.00);

ALTER TABLE Landmarks ADD CONSTRAINT unique_landmark_name UNIQUE (Name);

ALTER TABLE Landmarks DROP CONSTRAINT unique_landmark_name;

ALTER TABLE Landmarks ADD CONSTRAINT check_entry_fee_limit CHECK (EntryFee <= 100);

ALTER TABLE Landmarks DROP CONSTRAINT check_entry_fee_limit;
select * from Landmarks;
select * from IndianFestivals;
select * from IndianDishes;
select * from IndianMoviess;