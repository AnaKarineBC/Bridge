import devices.Radio;
import remotes.AdvancedRemote;
import remotes.BasicRemote;
import devices.Device;
import devices.Tv;

// A classe Demo é usada para demonstrar o funcionamento de diferentes dispositivos (como TV e Rádio)
// sendo controlados por diferentes tipos de controle remoto (básico e avançado).
public class Demo {
    public static void main(String[] args) {
        // Testa o dispositivo TV
        testDevice(new Tv());
        // Testa o dispositivo Rádio
        testDevice(new Radio());
    }

    // O método testDevice realiza testes com um dispositivo, controlando-o com diferentes controles remotos.
    public static void testDevice(Device device) {
        // Exibe uma mensagem indicando que os testes com o controle remoto básico estão iniciando.
        System.out.println("Tests with basic remote.");
        // Instancia o controle remoto básico, associando-o ao dispositivo fornecido.
        BasicRemote basicRemote = new BasicRemote(device);

        // Alterna o estado de ligado/desligado do dispositivo usando o controle remoto básico.
        basicRemote.power();
        // Exibe o status atual do dispositivo.
        device.printStatus();

        // Exibe uma mensagem indicando que os testes com o controle remoto avançado estão iniciando.
        System.out.println("Tests with advanced remote.");
        // Instancia o controle remoto avançado, associando-o ao dispositivo fornecido.
        AdvancedRemote advancedRemote = new AdvancedRemote(device);

        // Alterna o estado de ligado/desligado do dispositivo usando o controle remoto avançado.
        advancedRemote.power();
        // Silencia o dispositivo usando o controle remoto avançado (se o dispositivo suportar essa funcionalidade).
        advancedRemote.mute();
        // Exibe o status atual do dispositivo após os comandos do controle remoto avançado.
        device.printStatus();
    }
}
