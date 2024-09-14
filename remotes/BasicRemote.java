package remotes;

import devices.Device;

// A classe BasicRemote implementa a interface Remote e define funcionalidades básicas de um controle remoto,
// como ligar/desligar o dispositivo, ajustar o volume e mudar os canais.
public class BasicRemote implements Remote {
    // Atributo protegido que mantém uma referência ao dispositivo controlado pelo controle remoto.
    protected Device device;

    // Construtor sem parâmetros. Pode ser usado se o dispositivo for associado posteriormente.
    public BasicRemote() {}

    // Construtor que recebe um dispositivo e associa esse dispositivo ao controle remoto.
    public BasicRemote(Device device) {
        this.device = device;
    }

    // Método que alterna o estado do dispositivo entre ligado e desligado.
    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        // Verifica se o dispositivo está ligado. Se sim, desliga-o. Caso contrário, liga-o.
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    // Método que reduz o volume do dispositivo em 10 unidades.
    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        // Define o volume como 10 unidades a menos que o volume atual.
        device.setVolume(device.getVolume() - 10);
    }

    // Método que aumenta o volume do dispositivo em 10 unidades.
    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        // Define o volume como 10 unidades a mais que o volume atual.
        device.setVolume(device.getVolume() + 10);
    }

    // Método que reduz o número do canal em 1.
    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        // Define o canal atual como o número do canal menos 1.
        device.setChannel(device.getChannel() - 1);
    }

    // Método que aumenta o número do canal em 1.
    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        // Define o canal atual como o número do canal mais 1.
        device.setChannel(device.getChannel() + 1);
    }
}
