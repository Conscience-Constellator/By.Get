package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long$ChR;

public interface Get_ChR_By_Long extends
	Get_Q_By_Long,
	Get_ChR_By_Q,
	Long$ChR
{
	@Lin_Dclar
	char Get_ChR_By_Long(long By);
		@Override @Nevr_Neds_Ovrid
		default char Long$ChR(long In)
		{return Get_ChR_By_Long(In);}
}