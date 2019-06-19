#language: pt
  Funcionalidade: Characters - Personagens

  Esquema do Cenario: Consultar personagens por id
    Quando consulto o id "<id>"
    Entao o status code do retorno deve ser <statusCode>
    E deve ser retornado o personagem "<personagem>"

    Exemplos:
    |id     |statusCode|personagem     |
    |1009368|200       |Iron Man       |
    |1009610|200       |Spider-Man     |
    |1009189|200       |Black Widow    |
    |1009351|200       |Hulk           |
    |1009664|200       |Thor           |
    |1009220|200       |Captain America|
    |null   |404       |nenhum         |
    |1      |404       |nenhum         |
    |00     |404       |nenhum         |
