package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long$Dubl;

public interface Get_Dubl_By_Long extends
	Get_Q_By_Long,
	Get_Dubl_By_Q,
	Long$Dubl
{
	@Lin_Dclar
	double Get_Dubl_By_Long(long By);
		@Override @Nevr_Neds_Ovrid
		default double Long$Dubl(long In)
		{return Get_Dubl_By_Long(In);}
}