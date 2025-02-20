class Lamp {
  boolean isOn;
  
  
  void Switch() {
    isOn = !isOn;
  }
  void turnOn () {
    isOn = true;
  }
  void turnOff () {
    isOn = false;
  }
  
  
  void printState() {
    println(isOn + " The Lamp is on ");
  }
}
