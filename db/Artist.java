package db;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
	private int ArtistId;
	private String Name;
	
	@Id
	public int getArtistId(){
		return this.ArtistId;
	}
	
	public void setArtistId(int artistId) {
		ArtistId = artistId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString(){
		return String.format("<%s %s>", this.ArtistId, this.Name);
	}
	
}
