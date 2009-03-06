package enums;

public enum EstadoCivil {

    SOLTEIRO('1'),
    CASADO('2'),
    DIVORCIADO('3'),
    VIUVO('4');
    private char estado;

    private EstadoCivil(char estado) {
        this.estado = estado;
    }

    public char getEstado() {
        return estado;
    }

    public static EstadoCivil stringToValue(String s) {
        String s1 = s.replace("ú", "u");
        return EstadoCivil.valueOf(s1);
    }

    public static EstadoCivil charToValue(char c) {
        switch(c)
        {
            case '2':
                return EstadoCivil.CASADO;
            case '3':
                return EstadoCivil.DIVORCIADO;
            case '4':
                return EstadoCivil.VIUVO;
            default:
                return EstadoCivil.SOLTEIRO;
        }
    }

    public static char retornaEstadoCivil(EstadoCivil e) {
        switch (e) {
            case CASADO:
                return '2';
            case DIVORCIADO:
                return '3';
            case VIUVO:
                return '4';
            default:
                return '1';
        }
    }

    @Override
    public String toString() {
        switch (estado) {
            case '2':
                return "Casado";
            case '3':
                return "Divorciado";
            case '4':
                return "Viúvo";
            default:
                return "Solteiro";
        }
    }
}