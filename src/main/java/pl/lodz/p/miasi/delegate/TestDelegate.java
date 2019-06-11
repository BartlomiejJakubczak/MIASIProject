package pl.lodz.p.miasi.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import pl.lodz.p.miasi.model.Faktura;

public class TestDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Faktura faktura = (Faktura) delegateExecution.getVariable("faktura");
        System.out.println(faktura);
    }

}
