
public class WebsiteFIB implements Website {
	
	@Override
	public void opcaoFavoritos(String descricao) {
		System.out.println(descricao + " - P�gina FIB");
	}
	@Override
	public void opcaoHistorico(String descricao) {
		System.out.println(descricao + " - P�gina FIB");
	}
	@Override
	public void opcaoCache(String descricao) {
		System.out.println(descricao + " - Cache FIB");
	}
}
