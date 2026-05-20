const pessoas =
    JSON.parse(localStorage.getItem('clientes'))
    || [];

const botao =
    document.getElementById('cadastrar');

botao.addEventListener('click', () => {

    const nome =
        document.getElementById('nome').value;

    const email =
        document.getElementById('email').value;

    const telefone =
        document.getElementById('telefone').value;

    
    if(nome === '' || email === '' || telefone === ''){

        alert('Preencha todos os campos');

        return;
    }

    // objeto do cliente
    const pessoa = {

        nome,
        email,
        telefone

    };

    // adiciona no array
    pessoas.push(pessoa);

    // salva no localStorage
    localStorage.setItem(
        'clientes',
        JSON.stringify(pessoas)
    );

    // limpa os inputs
    document.getElementById('nome').value = '';

    document.getElementById('email').value = '';

    document.getElementById('telefone').value = '';

    alert('Cliente cadastrado com sucesso');

});


// botão para ir para a página de cadastros

const botaoSalvos =
    document.getElementById('salvos');

botaoSalvos.addEventListener('click', () => {

    window.location.href =
        'cadastros.html';

});


// limpar apenas a tabela

const botaoLimparTabela =
    document.getElementById('limparTabela');

botaoLimparTabela.addEventListener('click', () => {

    const tabela =
        document.getElementById('tabelaClientes');

    tabela.innerHTML = '';

});


// apagar todos os cadastros

const botaoLimparCadastros =
    document.getElementById('limparCadastros');

botaoLimparCadastros.addEventListener('click', () => {

    localStorage.removeItem('clientes');

    alert('Cadastros apagados');

});
