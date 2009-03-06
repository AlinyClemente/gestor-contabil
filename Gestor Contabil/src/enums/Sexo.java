package enums;

public enum Sexo {

    MASCULINO('m'),
    FEMININO('f');
    private char sexo;

    private Sexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public static Sexo stringToValue(String s) {
        return Sexo.valueOf(s.toUpperCase());
    }

    public static Sexo charToValue(char c) {
        return (c == 'm' ?  Sexo.MASCULINO : Sexo.FEMININO);
    }

    public static char retornaSexo(Sexo s)
    {
        return (s == MASCULINO ? 'm' : 'f');
    }

     @Override
    public String toString() {
        return (sexo == 'm' ? "Masculino" : "Feminino");
    }
}