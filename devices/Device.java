package devices;

// Interface Device define um contrato para dispositivos genéricos (ex.: TV, Rádio)
// Todas as classes que implementarem essa interface devem fornecer implementações para os métodos abaixo.
public interface Device {

    // Método para verificar se o dispositivo está ligado ou desligado.
    boolean isEnabled();

    // Método para ligar o dispositivo.
    void enable();

    // Método para desligar o dispositivo.
    void disable();

    // Método para obter o volume atual do dispositivo.
    int getVolume();

    // Método para ajustar o volume do dispositivo. O valor passado deve ser entre 0 e 100.
    void setVolume(int percent);

    // Método para obter o canal atual do dispositivo (caso o dispositivo tenha canais, como uma TV).
    int getChannel();

    // Método para mudar o canal do dispositivo.
    void setChannel(int channel);

    // Método para imprimir o status atual do dispositivo (ex.: ligado/desligado, volume, canal, etc.).
    void printStatus();
}
