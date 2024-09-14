package remotes;

// A interface Remote define o contrato para os controles remotos.
// Qualquer classe que implementar esta interface será obrigada a fornecer
// implementações para os métodos definidos abaixo.
public interface Remote {

    // Método para alternar o estado de energia (ligar/desligar) do dispositivo.
    void power();

    // Método para diminuir o volume do dispositivo.
    void volumeDown();

    // Método para aumentar o volume do dispositivo.
    void volumeUp();

    // Método para diminuir o canal do dispositivo.
    void channelDown();

    // Método para aumentar o canal do dispositivo.
    void channelUp();
}
