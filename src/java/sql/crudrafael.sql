-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 27-Set-2014 às 21:24
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `crudrafael`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `telefone` varchar(100) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`codigo`, `nome`, `telefone`) VALUES
(2, 'Rodrigo', '88292812'),
(3, 'Rafael Lucio', '99739504'),
(4, 'israel', '33363711'),
(5, 'Tiago', '99784512');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
