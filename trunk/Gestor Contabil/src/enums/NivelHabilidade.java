package enums;

public enum NivelHabilidade {

    BASICO('1'),
    INTERMEDIARIO('2'),
    AVANCADO('3');
    private char nivel;

    private NivelHabilidade(char nivel) {
        this.nivel = nivel;
    }

    public char getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        switch (nivel) {
            case '2':
                return "Intermediário";
            case '3':
                return "Avançado";
            default:
                return "Básico";
        }
    }

    public static NivelHabilidade stringToValue(String s) {
        String s1 = s.replace("á", "a");
        String s2 = s1.replace("ç", "c");

        return NivelHabilidade.valueOf(s2.toUpperCase());
    }
    
    public static NivelHabilidade charToNivelHabilidade(String s){
        char c = s.charAt(0);
        
        switch(c){
            case '1':
                return BASICO;
            case'2':
                return INTERMEDIARIO;
            default:
                return AVANCADO;
        }
    }

    public static char retornaNivelHabilidade (NivelHabilidade n)
    {
        char indice = '1';

        switch(n)
        {
            case INTERMEDIARIO:
                indice = '2';
                break;
            case AVANCADO:
                indice ='3';
                break;
        }

        return indice;
    }
}