package devices;

import interfaces.InterfaceMusica;

public class Ipod implements InterfaceMusica {
    private boolean statusMusic = false;
    private int statusVolume = 0;
    private int i;

    @Override
    public void play() {
        if(statusMusic) {
            System.out.println("Pause the music");
            statusMusic = false;
        } else {
            System.out.println("Play the music");
        }
    }

    @Override
    public void stop() {
        statusMusic = false;
        System.out.println("Stop the music");
    }

    @Override
    public void back() {
        if(i > 0 && i < 1000) {
            i -= 1;
            System.out.println("You listening music " + i);
        } else {
            i = 1000;
            i -= 1;
            System.out.println("You listening music " + i);
        }
    }

    @Override
    public void next() {
        if(i > 0 && i < 1000) {
            i += 1;
            System.out.println("You listening music " + i);
        } else {
            i = 0;
            i += 1;
            System.out.println("You listening music " + i);
        }
    }

    @Override
    public void volumeMinus() {
        if(statusVolume >= 0 && statusVolume <= 100) {
            statusVolume -= 1;
            System.out.println("Volume: " + statusVolume);
        }
    }

    @Override
    public void volumePlus() {
        if(statusVolume > 0  && statusVolume < 100) {
            statusVolume += 1;
            System.out.println("Volume: " + statusVolume);

        }
    }

}
