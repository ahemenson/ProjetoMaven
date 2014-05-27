package foo;

import org.junit.*;



public class AppTest  {
	
	
    
	@Test
    public void testApp()
    {
		App appJogo = new App();
		appJogo.setNome("nome do app");		
		appJogo.iniciaPontuação();
		Assert.assertTrue("esperado que seja verdadeiro", 0 == appJogo.getPontuacao());
		appJogo.setPontuacao(10);
		Assert.assertTrue("esperado que seja verdadeiro", 10 == appJogo.getPontuacao());
		Assert.assertEquals("nome do app", appJogo.getNome());
		appJogo.setNome("app");	
		Assert.assertEquals("app", appJogo.getNome());
		
		
		
		
		
		
		
      
    }
}
