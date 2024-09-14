package remotes;

import devices.Device;

// A classe AdvancedRemote estende (herda) a classe BasicRemote, adicionando funcionalidades mais avançadas,
// como a capacidade de silenciar o dispositivo.
public class AdvancedRemote extends BasicRemote {

    // Construtor que inicializa o controle remoto avançado com um dispositivo.
    // O dispositivo é passado para o controle remoto básico usando o super (chamando o construtor da superclasse).
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    // Método para silenciar o dispositivo, definindo o volume para 0.
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0); // Define o volume do dispositivo como 0.
    }
}
