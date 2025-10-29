package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long$Short;

public interface Get_Short_By_Long extends
	Get_Q_By_Long,
	Get_Short_By_Q,
	Long$Short
{
	@Lin_Dclar
	short Get_Short_By_Long(long By);
		@Override @Nevr_Neds_Ovrid
		default short Long$Short(long In)
		{return Get_Short_By_Long(In);}
}