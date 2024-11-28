# *Aplicativo Mobile com Integração ViaCEP*
Este projeto é um aplicativo mobile desenvolvido para realizar consultas de endereços utilizando a API ViaCEP. O ViaCEP é uma API pública que permite buscar informações de endereços brasileiros a partir do CEP, retornando dados como o logradouro, bairro, cidade, estado e outros detalhes.

# Objetivo do Projeto
O principal objetivo deste projeto é oferecer uma interface simples onde os usuários podem inserir um CEP e obter as informações relacionadas ao endereço correspondente. A aplicação utiliza a API pública ViaCEP para fazer a consulta em tempo real e exibir os resultados de maneira rápida e eficiente.

# Tecnologias Utilizadas
Gradle: Sistema de automação de builds, utilizado para gerenciar dependências e configurar o processo de compilação.
Kotlin: Linguagem principal usada no desenvolvimento do aplicativo Android.
Android SDK: Framework para a construção da interface e interação com a API no ambiente Android.

# Funcionalidades
Consulta de Endereço: O usuário insere um CEP no campo de pesquisa e o aplicativo faz uma consulta à API ViaCEP.
Exibição de Dados: A resposta da API, contendo informações como rua, bairro, cidade e estado, é exibida para o usuário.
Validação de CEP: O aplicativo valida a entrada do usuário para garantir que o formato do CEP esteja correto antes de fazer a consulta.

# Como Funciona
- O usuário insere um CEP na interface do aplicativo.
- O aplicativo faz uma requisição à API ViaCEP, passando o CEP informado.
- A API responde com os dados do endereço, que são exibidos no aplicativo.
- Caso o CEP não exista ou haja algum erro na consulta, o aplicativo exibe uma mensagem de erro.


![Finalizando e listando endereços buscados da API do VIACEP com Jetpack Compose no Android Studio - YouTube - Google Chrome 28_11_2024 14_37_48](https://github.com/user-attachments/assets/0ddd0031-d813-43a2-8eb5-993dd9becdc2)
