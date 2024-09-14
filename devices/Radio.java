package devices;

import devices.Device;

// A classe Radio implementa a interface Device, representando um dispositivo de rádio.
public class Radio implements Device {
    // Variável para armazenar o estado ligado/desligado do rádio.
    private boolean on = false;

    // Variável para armazenar o volume do rádio, iniciando com valor padrão de 30.
    private int volume = 30;

    // Variável para armazenar o canal atual do rádio, iniciando no canal 1.
    private int channel = 1;

    // Método que verifica se o rádio está ligado ou desligado.
    @Override
    public boolean isEnabled() {
        return on;
    }

    // Método que liga o rádio.
    @Override
    public void enable() {
        on = true;
    }

    // Método que desliga o rádio.
    @Override
    public void disable() {
        on = false;
    }

    // Método que retorna o volume atual do rádio.
    @Override
    public int getVolume() {
        return volume;
    }

    // Método que define o volume do rádio, com controle de limites (0 a 100).
    @Override
    public void setVolume(int volume) {
        // Se o volume for maior que 100, define como 100.
        if (volume > 100) {
            this.volume = 100;
            // Se o volume for menor que 0, define como 0.
        } else if (volume < 0) {
            this.volume = 0;
            // Caso contrário, define o volume com o valor passado.
        } else {
            this.volume = volume;
        }
    }

    // Método que retorna o canal atual do rádio.
    @Override
    public int getChannel() {
        return channel;
    }

    // Método que define o canal do rádio.
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    // Método que imprime o status atual do rádio no console, exibindo se está ligado/desligado,
    // o volume e o canal.
    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled")); // Verifica se está ligado ou desligado.
        System.out.println("| Current volume is " + volume + "%");    // Exibe o volume atual.
        System.out.println("| Current channel is " + channel);         // Exibe o canal atual.
        System.out.println("------------------------------------\n");
    }
}
