const pessoas =
    JSON.parse(localStorage.getItem('clientes'))
    || [];


// CADASTRAR

const botaoCadastrar =
    document.getElementById('cadastrar');

botaoCadastrar.addEventListener('click', () => {

    const nome =
        document.getElementById('nome').value;

    const email =
        document.getElementById('email').value;

    const telefone =
        document.getElementById('telefone').value;


    if(
        nome === '' ||
        email === '' ||
        telefone === ''
    ){

        alert('Preencha todos os campos');

        return;

    }


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


    document.getElementById('nome').value = '';

    document.getElementById('email').value = '';

    document.getElementById('telefone').value = '';


    alert('Cliente cadastrado');

});




// MOSTRAR CADASTROS

const botaoMostrar =
    document.getElementById('salvos');

botaoMostrar.addEventListener('click', () => {

    window.location.href =
        'cadastros.html';

});




// LIMPAR CADASTROS

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
