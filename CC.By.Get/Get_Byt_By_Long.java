package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long$Byt;

public interface Get_Byt_By_Long extends
	Get_Q_By_Long,
	Get_Byt_By_Q,
	Long$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_Long(long By);
		@Override @Nevr_Neds_Ovrid
		default byte Long$Byt(long In)
		{return Get_Byt_By_Long(In);}
}