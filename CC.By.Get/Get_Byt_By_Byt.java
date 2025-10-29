package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Byt$Short;

public interface Get_Byt_By_Byt extends
	Get_Byt_By_Q,
	Get_Q_By_Byt,
	Byt$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default byte Byt$Byt(byte In)
		{return Get_Byt_By_Byt(In);}
}