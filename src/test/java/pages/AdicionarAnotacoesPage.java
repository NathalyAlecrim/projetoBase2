package pages;

import elementos.AdicionarAnotacoesElemento;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import properties.TestRule;

public class AdicionarAnotacoesPage extends AdicionarAnotacoesElemento {
    public AdicionarAnotacoesPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void clicoEmVerTarefa() {
        menuVerTarefas.click();
    }

    public void selecionoUmaTarefa() {
        btnSelectTarefa.click();
    }

    public void selecionoAdicionoAnotcao() {
        Select select = new Select(campoSelecionarAdicionarNota);
        select.selectByVisibleText("Adicionar Anotação");
        btnOk.click();
    }

    public void preenchoOcampo(String anotacao) {
        campoAdicionarNota.sendKeys(anotacao);
    }

    public void validarRetornodaPagina() {
        btnAdcNota.click();
        Assert.assertTrue(retornoParaPage.isDisplayed());
    }

}