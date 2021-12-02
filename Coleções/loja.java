package collections;


	public class loja {
		private String item;
		private int quantidade;
		
		public loja(String item, int quantidade) {
			super();
			this.item = item;
			this.quantidade = quantidade;
		}

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public String toString() {
			return "Item: "+this.item+" | Quantidade: "+this.quantidade;
		}
		
	}
