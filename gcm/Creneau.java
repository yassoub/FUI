package gcm;

public class Creneau {
private int id;
private int medecin_id;
private int hdebut;
private int hfin;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMedecin_id() {
	return medecin_id;
}
public void setMedecin_id(int medecin_id) {
	this.medecin_id = medecin_id;
}
public int getHdebut() {
	return hdebut;
}
public void setHdebut(int hdebut) {
	this.hdebut = hdebut;
}
public int getHfin() {
	return hfin;
}
public void setHfin(int hfin) {
	this.hfin = hfin;
}
public int getMdebut() {
	return mdebut;
}
public void setMdebut(int mdebut) {
	this.mdebut = mdebut;
}
public int getMfin() {
	return mfin;
}
public void setMfin(int mfin) {
	this.mfin = mfin;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
private int mdebut;
private int mfin;
private int version;
public Creneau(int id, int medecin_id, int hdebut, int hfin, int mdebut, int mfin, int version) {
	super();
	this.id = id;
	this.medecin_id = medecin_id;
	this.hdebut = hdebut;
	this.hfin = hfin;
	this.mdebut = mdebut;
	this.mfin = mfin;
	this.version = version;
}
}
