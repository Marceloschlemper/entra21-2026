const pessoas =
    JSON.parse(localStorage.getItem('clientes'))
    || [];

const botao =
    document.getElementById('cadastrar');

const tabela =
    document.getElementById('tabelaClientes');

const botaoSalvos =
    document.getElementById('salvos');

const botaoLimpar =
    document.getElementById('limparTabela');

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

    localStorage.setItem(
        'clientes',
        JSON.stringify(pessoas)
    );

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

botaoSalvos.addEventListener('click', () => {

    tabela.innerHTML = '';

    const pessoasSalvas =
        JSON.parse(
            localStorage.getItem('clientes')
        ) || [];

    pessoasSalvas.forEach((pessoa) => {

        tabela.innerHTML += `
            <tr>
                <td>${pessoa.nome}</td>
                <td>${pessoa.email}</td>
                <td>${pessoa.telefone}</td>
            </tr>
        `;

    });

});

botaoLimpar.addEventListener('click', () => {

    tabela.innerHTML = '';

    const botaoLimparCadastros =
    document.getElementById('limparCadastros');

    botaoLimparCadastros.addEventListener('click', () => {

    tabela.innerHTML = '';

    localStorage.removeItem('clientes');

    pessoas.length = 0;

});

});
