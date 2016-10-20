import java.io.Serializable;

public class JB_NormandySysCheck implements Serializable{

	//TRUE means operational.
	//Integers represent a quantity.
	//Doubles represent a percentage.
	
	// Propulsion and Power
	boolean driveCore = true;
	int     fuelCells = 100;
	boolean lifeSupport = true;
	
	// Computer System
	boolean edi = true;
	
	// Defensive Power
	double  kineticBarrier = 100;
	boolean cloak = true;
	
	//Weapons Systems
	int     javelinTorpedoCt = 50;
	boolean javelinTorpedoArm = true;
	boolean thanixCanon = true;
	boolean gardianLasers = true;
	
	//Getter and Setter Methods
	public JB_NormandySysCheck(){
	}
	public boolean isDriveCore() {
		return driveCore;
	}
	public void setDriveCore(boolean driveCore) {
		this.driveCore = driveCore;
	}
	public double getFuelCells() {
		return fuelCells;
	}
	public void setFuelCells(int fuelCells) {
		this.fuelCells = fuelCells;
	}
	public boolean isLifeSupport() {
		return lifeSupport;
	}
	public void setLifeSupport(boolean lifeSupport) {
		this.lifeSupport = lifeSupport;
	}
	public boolean isEdi() {
		return edi;
	}
	public void setEdi(boolean edi) {
		this.edi = edi;
	}
	public double getKineticBarrier() {
		return kineticBarrier;
	}
	public void setKineticBarrier(int kineticBarrier) {
		this.kineticBarrier = kineticBarrier;
	}
	public boolean isCloak() {
		return cloak;
	}
	public void setCloak(boolean cloak) {
		this.cloak = cloak;
	}
	public int getJavelinTorpedoCt() {
		return javelinTorpedoCt;
	}
	public void setJavelinTorpedoCt(int javelinTorpedoCt) {
		this.javelinTorpedoCt = javelinTorpedoCt;
	}
	public boolean isJavelinTorpedoArm() {
		return javelinTorpedoArm;
	}
	public void setJavelinTorpedoArm(boolean javelinTorpedoArm) {
		this.javelinTorpedoArm = javelinTorpedoArm;
	}
	public boolean isThanixCanon() {
		return thanixCanon;
	}
	public void setThanixCanon(boolean thanixCanon) {
		this.thanixCanon = thanixCanon;
	}
	public boolean isGardianLasers() {
		return gardianLasers;
	}
	public void setGardianLasers(boolean gardianLasers) {
		this.gardianLasers = gardianLasers;
	}
	
}