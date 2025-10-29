package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Byt;

public interface Get_Byt_By_ChR extends
	Get_Q_By_ChR,
	Get_Byt_By_Q,
	ChR$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default byte ChR$Byt(char In)
		{return Get_Byt_By_ChR(In);}
}