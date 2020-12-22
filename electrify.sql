-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2020 at 06:45 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electrify`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('sam', '7272'),
('tausif', '8888');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `meter_number` varchar(20) NOT NULL,
  `month` varchar(20) DEFAULT NULL,
  `units` varchar(5) DEFAULT NULL,
  `amount` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`meter_number`, `month`, `units`, `amount`) VALUES
('14562711804', 'May', '912', '7089'),
('14562711987', 'September', '683', '9300');

-- --------------------------------------------------------

--
-- Table structure for table `billsbymonth`
--

CREATE TABLE `billsbymonth` (
  `meter_number` varchar(20) NOT NULL DEFAULT '01',
  `name` varchar(20) NOT NULL DEFAULT 'demo',
  `january` varchar(10) NOT NULL,
  `february` varchar(10) NOT NULL,
  `march` varchar(10) NOT NULL,
  `april` varchar(10) NOT NULL,
  `may` varchar(10) NOT NULL,
  `june` varchar(10) NOT NULL,
  `july` varchar(10) NOT NULL,
  `august` varchar(10) NOT NULL,
  `september` varchar(10) NOT NULL,
  `october` varchar(10) NOT NULL,
  `november` varchar(10) NOT NULL,
  `december` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billsbymonth`
--

INSERT INTO `billsbymonth` (`meter_number`, `name`, `january`, `february`, `march`, `april`, `may`, `june`, `july`, `august`, `september`, `october`, `november`, `december`) VALUES
('14562711410', 'sameer shaikh', '7807', '7553', '8912', '7385', '2994', '8588', '2233', '6410', '9593', '9608', '6154', '9499'),
('14562711738', 'Tausif', '7645', '2159', '5870', '2855', '3479', '4662', '6895', '8537', '8820', '2515', '8387', '5350'),
('14562711824', 'abdul haque', '6092', '5453', '7771', '3464', '6646', '4664', '1094', '4351', '8833', '3929', '3609', '4025');

-- --------------------------------------------------------

--
-- Table structure for table `cards`
--

CREATE TABLE `cards` (
  `cardno` bigint(20) NOT NULL,
  `expmonth` int(11) NOT NULL,
  `expyear` int(11) NOT NULL,
  `cvv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cards`
--

INSERT INTO `cards` (`cardno`, `expmonth`, `expyear`, `cvv`) VALUES
(4141222251512222, 12, 26, 172);

-- --------------------------------------------------------

--
-- Table structure for table `currentuser`
--

CREATE TABLE `currentuser` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `currentuser`
--

INSERT INTO `currentuser` (`username`, `password`) VALUES
('abdul haque', '9999'),
('sameer shaikh', 'samir@1234'),
('Tausif', '9999');

-- --------------------------------------------------------

--
-- Table structure for table `main`
--

CREATE TABLE `main` (
  `name` varchar(20) DEFAULT NULL,
  `meter_number` varchar(20) NOT NULL,
  `address` varchar(40) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `localadd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `main`
--

INSERT INTO `main` (`name`, `meter_number`, `address`, `state`, `city`, `email`, `phone`, `localadd`) VALUES
('sameer shaikh', '14562711410', 'govandi', 'maharashtra', 'mumbai', 'shaikhsameer2272@yahoo.com', '7977818640', 'indian oil nagar'),
('Tausif', '14562711738', 'mumbra', 'maharastra', 'mumbai', 'tausif@outlook.in', '9892788693', 'minaar regency '),
('abdul haque', '14562711824', 'shivaji nagar', 'maharashtra', 'mumbai', 'abdulhaque2001@gmail.com', '9167486954', 'sun mill compound');

-- --------------------------------------------------------

--
-- Table structure for table `meterdetails`
--

CREATE TABLE `meterdetails` (
  `meter_number` varchar(20) NOT NULL,
  `meter_location` varchar(10) DEFAULT NULL,
  `meter_type` varchar(15) DEFAULT NULL,
  `phase_code` varchar(5) DEFAULT NULL,
  `bill_type` varchar(10) DEFAULT NULL,
  `days` varchar(5) DEFAULT NULL,
  `meter_rent` varchar(5) DEFAULT NULL,
  `mcb_rent` varchar(5) DEFAULT NULL,
  `service_rent` varchar(5) DEFAULT NULL,
  `gst` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meterdetails`
--

INSERT INTO `meterdetails` (`meter_number`, `meter_location`, `meter_type`, `phase_code`, `bill_type`, `days`, `meter_rent`, `mcb_rent`, `service_rent`, `gst`) VALUES
('14562711410', 'inside', 'electronic', '28', 'normal', '861', '594', '45', '874', '754'),
('14562711738', 'inside', 'electronic', '47', 'normal', '259', '894', '61', '620', '824'),
('14562711824', 'inside', 'electronic', '62', 'normal', '525', '753', '83', '714', '164');

-- --------------------------------------------------------

--
-- Table structure for table `newuser`
--

CREATE TABLE `newuser` (
  `userId` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `mobile` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `newuser`
--

INSERT INTO `newuser` (`userId`, `name`, `email`, `password`, `mobile`) VALUES
(41, 'Tausif', 'tausif@outlook.in', '9999', 9892788693),
(42, 'abdul haque', 'abdulhaque2001@gmail.com', '9999', 9167486954),
(43, 'sameer shaikh', 'shaikhsameer2272@yahoo.com', 'samir@1234', 7977818640);

-- --------------------------------------------------------

--
-- Table structure for table `unitsbymonth`
--

CREATE TABLE `unitsbymonth` (
  `meter_number` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `january` varchar(10) NOT NULL,
  `february` varchar(10) NOT NULL,
  `march` varchar(10) NOT NULL,
  `april` varchar(10) NOT NULL,
  `may` varchar(10) NOT NULL,
  `june` varchar(10) NOT NULL,
  `july` varchar(10) NOT NULL,
  `august` varchar(10) NOT NULL,
  `september` varchar(10) NOT NULL,
  `october` varchar(10) NOT NULL,
  `november` varchar(10) NOT NULL,
  `december` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `unitsbymonth`
--

INSERT INTO `unitsbymonth` (`meter_number`, `name`, `january`, `february`, `march`, `april`, `may`, `june`, `july`, `august`, `september`, `october`, `november`, `december`) VALUES
('14562711410', 'sameer shaikh', '922', '137', '142', '531', '906', '709', '733', '235', '564', '226', '432', '279'),
('14562711738', 'Tausif', '789', '859', '441', '896', '897', '520', '272', '814', '909', '435', '209', '375'),
('14562711824', 'abdul haque', '289', '951', '163', '493', '361', '465', '439', '594', '203', '525', '516', '130');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`meter_number`);

--
-- Indexes for table `billsbymonth`
--
ALTER TABLE `billsbymonth`
  ADD PRIMARY KEY (`meter_number`);

--
-- Indexes for table `cards`
--
ALTER TABLE `cards`
  ADD PRIMARY KEY (`cardno`),
  ADD UNIQUE KEY `cardno` (`cardno`);

--
-- Indexes for table `currentuser`
--
ALTER TABLE `currentuser`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `main`
--
ALTER TABLE `main`
  ADD PRIMARY KEY (`meter_number`),
  ADD UNIQUE KEY `meter_number` (`meter_number`),
  ADD UNIQUE KEY `phone` (`phone`);

--
-- Indexes for table `meterdetails`
--
ALTER TABLE `meterdetails`
  ADD PRIMARY KEY (`meter_number`);

--
-- Indexes for table `newuser`
--
ALTER TABLE `newuser`
  ADD PRIMARY KEY (`userId`);

--
-- Indexes for table `unitsbymonth`
--
ALTER TABLE `unitsbymonth`
  ADD PRIMARY KEY (`meter_number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `newuser`
--
ALTER TABLE `newuser`
  MODIFY `userId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
