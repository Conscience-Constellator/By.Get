package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short1$1;

public interface Get_Short_By_Short extends
	Get_Q_By_Short,
	Get_Short_By_Q,
	Short1$1
{
	@Lin_Dclar
	short Get_Short_By_Short(short By);
		@Override
		@Nevr_Neds_Ovrid
		default short Short1$1(short In){return Get_Short_By_Short(In);}
}