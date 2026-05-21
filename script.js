const pessoas =
    JSON.parse(localStorage.getItem('clientes'))
    || [];


//preencher email automatico

const inputNome =
    document.getElementById('nome');

inputNome.addEventListener('input', () => {

    const nomeDigitado =
        inputNome.value.toLowerCase();

    const clienteEncontrado =
        pessoas.find((pessoa) => {

            return (
                pessoa.nome.toLowerCase()
                === nomeDigitado
            );

        });

    if(clienteEncontrado){

        document.getElementById('email').value =
            clienteEncontrado.email;

    }

});




// Cadastro

const botaoCadastrar =
    document.getElementById('cadastrar');

botaoCadastrar.addEventListener('click', () => {

    const nome =
        document.getElementById('nome').value;

    const email =
        document.getElementById('email').value;

    const telefone =
        document.getElementById('telefone').value;

    const cep =
        document.getElementById('cep').value;


    if(
        nome === '' ||
        email === '' ||
        telefone === '' ||
        cep === ''
    ){

        alert('Preencha todos os campos');

        return;

    }


    const pessoa = {

        nome,
        email,
        telefone,
        cep

    };


    pessoas.push(pessoa);


    localStorage.setItem(
        'clientes',
        JSON.stringify(pessoas)
    );


    document.getElementById('nome').value = '';

    document.getElementById('email').value = '';

    document.getElementById('telefone').value = '';

    document.getElementById('cep').value = '';


    alert('Cliente cadastrado');

});




// Mostrar cadastros

const botaoMostrar =
    document.getElementById('salvos');

botaoMostrar.addEventListener('click', () => {

    window.location.href =
        'cadastros.html';

});




// Limpar cadastros

const botaoLimparCadastros =
    document.getElementById('limparCadastros');

botaoLimparCadastros.addEventListener('click', () => {

    const confirmar =
        confirm(
            'Deseja apagar todos os cadastros?'
        );


    if(confirmar){

        localStorage.removeItem('clientes');

        alert('Cadastros apagados');

        location.reload();

    }

});
