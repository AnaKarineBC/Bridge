package devices;
import devices.Device;

// A classe Tv implementa a interface Device e representa uma televisão com funcionalidades básicas,
// como ligar/desligar, ajustar o volume e mudar de canal.
public class Tv implements Device {
    // Atributos privados que representam o estado da TV: se está ligada/desligada, o volume atual e o canal atual.
    private boolean on = false;  // Estado inicial: desligada.
    private int volume = 30;     // Volume inicial: 30%.
    private int channel = 1;     // Canal inicial: 1.

    // Método que retorna se a TV está ligada.
    @Override
    public boolean isEnabled() {
        return on;
    }

    // Método que liga a TV.
    @Override
    public void enable() {
        on = true;
    }

    // Método que desliga a TV.
    @Override
    public void disable() {
        on = false;
    }

    // Método que retorna o volume atual da TV.
    @Override
    public int getVolume() {
        return volume;
    }

    // Método que ajusta o volume da TV. O volume é limitado entre 0 e 100.
    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;   // Se o volume passado for maior que 100, define como 100.
        } else if (volume < 0) {
            this.volume = 0;     // Se o volume for menor que 0, define como 0.
        } else {
            this.volume = volume; // Caso contrário, define o volume ao valor passado.
        }
    }

    // Método que retorna o canal atual da TV.
    @Override
    public int getChannel() {
        return channel;
    }

    // Método que ajusta o canal da TV para o valor especificado.
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    // Método que imprime o status atual da TV, como o estado (ligada/desligada), o volume e o canal.
    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled")); // Verifica se a TV está ligada ou desligada.
        System.out.println("| Current volume is " + volume + "%");    // Mostra o volume atual.
        System.out.println("| Current channel is " + channel);        // Mostra o canal atual.
        System.out.println("------------------------------------\n");
    }
}
