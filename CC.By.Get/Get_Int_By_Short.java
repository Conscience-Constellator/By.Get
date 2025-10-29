package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$Int;

public interface Get_Int_By_Short extends
	Get_Q_By_Short,
	Get_Int_By_Q,
	Short$Int
{
	@Lin_Dclar
	int Get_Int_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default int Short$Int(short In)
		{return Get_Int_By_Short(In);}
}