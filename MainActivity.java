public void selecionarPedra(View view){
        verificarganhador("pedra");
    }

    public void selecionarPapel(View view){
        verificarganhador("papel");
    }

    public void selecionarTesoura(View view){
        verificarganhador("tesoura");
    }

    private String gerarEscolhaAleatoriaApp(){

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numeroAleatorio = new Random().nextInt(3);

        String escolhaApp = opcoes[numeroAleatorio];

        ImageView imagemApp = findViewById(R.id.image_app);

        switch (escolhaApp){
            case "pedra":
                imagemApp.setImageResource(R.drawable.pedra);
            case "papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
                break;

        }

        return escolhaApp;

    }

    private void verificarganhador(String escolhausuario) {
        System.out.println("Item clicado: " + escolhausuario);

        String escolhaApp = gerarEscolhaAleatoriaApp();
        TextView textoResultado = findViewById(R.id.text_resultado);

        if (
                (escolhaApp.equals("pedra") && escolhausuario.equals("tesoura")) ||
                        (escolhaApp.equals("papel") && escolhausuario.equals("pedra")) ||
                        (escolhaApp.equals("tesoura") && escolhausuario.equals("papel"))
        ) {
            textoResultado.setText("Você perdeu!");
        } else if (
                (escolhausuario.equals("pedra") && escolhaApp.equals("tesoura")) ||
                        (escolhausuario.equals("papel") && escolhaApp.equals("pedra")) ||
                        (escolhausuario.equals("tesoura") && escolhaApp.equals("papel"))
        ) {
            textoResultado.setText("Você ganhou!");
        } else {
            textoResultado.setText("Empatamos!");
        }
    }
    

}
