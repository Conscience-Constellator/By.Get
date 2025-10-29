package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long$Flot;

public interface Get_Flot_By_Long extends
	Get_Q_By_Long,
	Get_Flot_By_Q,
	Long$Flot
{
	@Lin_Dclar
	float Get_Flot_By_Long(long By);
		@Override @Nevr_Neds_Ovrid
		default float Long$Flot(long In)
		{return Get_Flot_By_Long(In);}
}