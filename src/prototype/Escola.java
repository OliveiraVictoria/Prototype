package prototype;

public class Escola {

    public class escola implements Cloneable {
        private String logradouro;
        private Integer numero;

        public escola(String logradouro, Integer numero) {
            super();
            this.logradouro = logradouro;
            this.numero = numero;
        }

        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Escola{" +
                    "logradouro='" + logradouro + '\'' +
                    ", numero=" + numero +
                    '}';
        }
    }

}
