-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2022 at 01:57 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agencia_viagem`
--

-- --------------------------------------------------------

--
-- Table structure for table `bilhete`
--

CREATE TABLE `bilhete` (
  `id` int(11) NOT NULL,
  `bi_nome_cliente` varchar(255) NOT NULL,
  `bi_origem` varchar(45) NOT NULL,
  `bi_destino` varchar(45) NOT NULL,
  `bi_situacao` varchar(30) NOT NULL,
  `nr_cartao` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bilhete`
--

INSERT INTO `bilhete` (`id`, `bi_nome_cliente`, `bi_origem`, `bi_destino`, `bi_situacao`, `nr_cartao`) VALUES
(19, 'Isaias Munguambe', 'maputo', 'zambezia', 'ida', '1111 1111 2222 11111');

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id_cod` int(11) NOT NULL,
  `nome_cliente` varchar(255) NOT NULL,
  `nr_cartao` varchar(20) NOT NULL,
  `saldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id_cod`, `nome_cliente`, `nr_cartao`, `saldo`) VALUES
(1, 'Manuela Manuel', '1111 1111 2222 1111', 28777.01),
(2, 'Isaias Munguambe', '2222 1111 3333 1111', 19978);

-- --------------------------------------------------------

--
-- Table structure for table `funcionario`
--

CREATE TABLE `funcionario` (
  `func_codigo` int(11) NOT NULL,
  `func_apelido` varchar(45) NOT NULL,
  `func_nome` varchar(255) NOT NULL,
  `func_genero` enum('M','F') NOT NULL,
  `func_datanascimento` date NOT NULL,
  `func_bairro` varchar(30) NOT NULL,
  `func_quarteirao` varchar(45) DEFAULT NULL,
  `func_casa` varchar(10) DEFAULT NULL,
  `func_email` varchar(45) NOT NULL,
  `func_username` varchar(30) NOT NULL,
  `func_password` varchar(30) NOT NULL,
  `func_alcunha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `funcionario`
--

INSERT INTO `funcionario` (`func_codigo`, `func_apelido`, `func_nome`, `func_genero`, `func_datanascimento`, `func_bairro`, `func_quarteirao`, `func_casa`, `func_email`, `func_username`, `func_password`, `func_alcunha`) VALUES
(1, 'Munguambe', 'Isaias Ruben', 'M', '2022-11-07', 'Muhalaze', '11', '11', 'isaiasruben971@gmail.com', 'Isaias20', 'isa2504', 'Scrum'),
(2, 'Banze', 'Angel Elias', 'M', '2022-11-02', 'Guva ', '19', '11', 'aebanze@gmail.com', 'aebanze10', 'aebanze.12121', 'Faisca ');

-- --------------------------------------------------------

--
-- Table structure for table `marcacao`
--

CREATE TABLE `marcacao` (
  `id` int(11) NOT NULL,
  `data_partida` varchar(40) DEFAULT NULL,
  `data_chegada` varchar(30) DEFAULT NULL,
  `assentos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `registo`
--

CREATE TABLE `registo` (
  `codigo` int(11) NOT NULL,
  `nome_cliente` varchar(255) NOT NULL,
  `origem` varchar(40) NOT NULL,
  `destino` varchar(40) NOT NULL,
  `valor_pago` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registo`
--

INSERT INTO `registo` (`codigo`, `nome_cliente`, `origem`, `destino`, `valor_pago`) VALUES
(10, 'Isaias Munguambe', 'maputo', 'zambezia', 11);

-- --------------------------------------------------------

--
-- Table structure for table `voos`
--

CREATE TABLE `voos` (
  `codigo` int(11) NOT NULL,
  `origem` varchar(30) NOT NULL,
  `destino` varchar(30) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `restantes` int(11) NOT NULL,
  `preco` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voos`
--

INSERT INTO `voos` (`codigo`, `origem`, `destino`, `quantidade`, `restantes`, `preco`) VALUES
(1, 'Maputo', 'Gaza', 30, 30, 12000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bilhete`
--
ALTER TABLE `bilhete`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cod`),
  ADD UNIQUE KEY `nr_cartao` (`nr_cartao`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`func_codigo`);

--
-- Indexes for table `marcacao`
--
ALTER TABLE `marcacao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `registo`
--
ALTER TABLE `registo`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `voos`
--
ALTER TABLE `voos`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bilhete`
--
ALTER TABLE `bilhete`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `func_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `marcacao`
--
ALTER TABLE `marcacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `registo`
--
ALTER TABLE `registo`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `voos`
--
ALTER TABLE `voos`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
