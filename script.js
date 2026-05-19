 const pessoas = [];

        const botao =
            document.getElementById('cadastrar');

        const tabela =
            document.getElementById('tabelaClientes');

        botao.addEventListener('click', () => {

            const nome =
                document.getElementById('nome').value;

            const email =
                document.getElementById('email').value;

            const telefone =
                document.getElementById('telefone').value;

            const pessoa = {
                nome,
                email,
                telefone
            };

            pessoas.push(pessoa);

            tabela.innerHTML += `
                <tr>
                    <td>${pessoa.nome}</td>
                    <td>${pessoa.email}</td>
                    <td>${pessoa.telefone}</td>
                </tr>
            `;

            document.getElementById('nome').value = '';
            document.getElementById('email').value = '';
            document.getElementById('telefone').value = '';
        });
