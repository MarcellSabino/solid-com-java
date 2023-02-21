package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getNovoCargo() { return ANALISTA; }
	},
	ANALISTA {
		@Override
		public Cargo getNovoCargo() { return ESPECIALISTA; }
	},
	ESPECIALISTA {
		@Override
		public Cargo getNovoCargo() { return GERENTE; }
	},
	GERENTE {
		@Override
		public Cargo getNovoCargo() { return GERENTE; }
	};

	public abstract Cargo getNovoCargo();

}
