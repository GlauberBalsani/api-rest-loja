CREATE TABLE departamento (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255)
);
CREATE TABLE produtos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255),
  descricao VARCHAR(255) NOT NULL,
  departamento_id INT NOT NULL,
  FOREIGN KEY (departamento_id) REFERENCES departamento(id)
);
