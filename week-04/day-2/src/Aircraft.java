public class Aircraft {

  String type;

  int maxAmmo;
  int currentAmmo;
  int baseDamage;

  public Aircraft(String type) {
    this.type = type;
    this.maxAmmo = 0;
    this.currentAmmo = 0;
    this.baseDamage = 0;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public int fight(Aircraft opponent) {
    this.currentAmmo = 0;
    return baseDamage * maxAmmo;
  }

  public int refill(int num) {
    this.currentAmmo += (this.maxAmmo - this.currentAmmo);
    return (num - this.currentAmmo);
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return this.type + " Ammo: " + this.getCurrentAmmo() + " Base damage: " + this.baseDamage + " All Damage: " + baseDamage * maxAmmo;
  }

}
