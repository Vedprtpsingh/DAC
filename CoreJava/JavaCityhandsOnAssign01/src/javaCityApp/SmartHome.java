package javaCityApp;
public class SmartHome {
}
class LightBulb {
    boolean isOn;
    void toggle() {
        isOn = !isOn;
        if (isOn) {
            System.out.println("Light On");
        } else {
            System.out.println("Light Off");
        }
    }
}
class SmartRoom {
    private Speaker speaker;
    private LightBulb roomLight;
    public SmartRoom(Speaker speaker, LightBulb roomLight) {
        this.speaker = speaker;
        this.roomLight = roomLight;
    }
    void pressWallSwitch() {
        roomLight.toggle();
    }
    void partyMode() {
        if (!roomLight.isOn) {
            roomLight.toggle();
        }
        speaker.playMusic();
    }
}
class Speaker {
    void playMusic() {
        System.out.println("Music is Playing");
    }
}