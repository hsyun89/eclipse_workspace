package trainproj.spring.springtrain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.LoginDAO;
import vo.LoginVO;

@Controller
public class LoginController {
	@Autowired
	LoginDAO dao;
// 추가 사항
// 로그인 get방식으로 받은것을 저장
// 출력하지 않음
	@RequestMapping(value = "/loginmain", method = RequestMethod.GET)
	  public ModelAndView showLogin() {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("loginView");
	    return mav;
	  }

	@RequestMapping(value = "/loginmain", method = RequestMethod.POST)
	protected ModelAndView loginControl(String action, @ModelAttribute("login") LoginVO vo) {
		ModelAndView mav = new ModelAndView();
		System.out.println("start");
		System.out.println("get GET");
		if (vo.getUser_id() != null && vo.getPasswd() != null) {
			if (action != null && action.equals("login")) {
				System.out.println("조건 충족");
				if(dao.login(vo.getUser_id()).getUser_id().equals("")) {
					mav.addObject("msg", "틀렸어 푸쉬업 20개");
					System.out.println("로그인 실패");
					mav.setViewName("loginView");
					return mav;
				}else {
					mav.addObject("msg", vo.getUser_id() + "님 반갑습니다.");
//					mav.setViewName("welcome");
					mav.setViewName("loginView");
					System.out.println("로그인 성공");
					return mav;
				}
				
//				String result=dao.login(vo.getUser_id()).getUser_id(); //DB에서 id로 쿼리 받아온 결과
//				System.out.println(result);
//				if(result!=null&&vo.getUser_id().equals(result)) {
//					mav.addObject("msg", vo.getUser_id() + "님 반갑습니다.");
////					mav.setViewName("welcome");
//					mav.setViewName("loginView");
//					System.out.println("로그인 성공");
//					return mav;
//				}else {
//					mav.addObject("msg", "틀렸어 푸쉬업 20개");
//					System.out.println("로그인 실패");
//					mav.setViewName("loginView");
//					return mav;
//				}

				
//				if (result) {
//					mav.addObject("msg", vo.getUser_id() + "님 반갑습니다.");
//					mav.setViewName("welcome");
//					System.out.println("로그인 성공");
//					return mav;
//				} else {
//					mav.addObject("msg", "틀렸어 푸쉬업 20개");
//					System.out.println("로그인 실패");
//					mav.setViewName("welcome");
//					return mav;
//				}
			}
		}
		System.out.println(dao.toString());
		System.out.println("액션 : " + action);
		System.out.println(vo.toString());
		System.out.println("완료 finish POST");
		return mav;
	}
}