package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$Byt;

public interface Get_Byt_By_Flot extends
	Get_Q_By_Flot,
	Get_Byt_By_Q,
	Flot$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_Flot(float By);
		@Override @Nevr_Neds_Ovrid
		default byte Flot$Byt(float In)
		{return Get_Byt_By_Flot(In);}
}