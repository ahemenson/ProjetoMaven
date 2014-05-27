package foo;

public class App {

	private String nome;  
	private int pontos;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public void setNome(String string) {
		nome = string;
		
	}

	public void iniciaPontuação() {
		pontos = 0;
		
	}

	public void setPontuacao(int i) {
		pontos = i;
		
	}

	public int getPontuacao() {
		return pontos;
		
	}

	public String getNome() {
		return nome;
	}

	
}
