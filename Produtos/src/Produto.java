public abstract class Produto {

        private String descricao;
        private Double valor;
        private Double impostos;

        public Produto(){

        }
        public Produto(String descricao, Double valor, Double impostos) {
            this.descricao = descricao;
            this.valor = valor;
            this.impostos = impostos;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public Double getImpostos() {
            return impostos;
        }

        public void setImpostos(Double impostos) {
            this.impostos = impostos;
        }
    public void descricao(){
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + impostos + "%");
    }
}
