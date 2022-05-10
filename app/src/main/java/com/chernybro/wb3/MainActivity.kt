package com.chernybro.wb3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.chernybro.wb3.databinding.ActivityMainBinding
import com.chernybro.wb3.telegram.ConstraintTelegramFragment
import timber.log.Timber


// Q: отличия жизненного цикла фрагмента от жизненного цикла активити,
//    ответить на вопрос - для чего нужны эти отличия, почему они возникли?
// A: В жизненном цикле фрагмента больше методов, потому что фрагмент не может существовть без активити
//    Например, нам нужно знать прикреплен ли фрагмент к активити прежде чем вызывать методы которые используют getActivity()

// Q: Для чего нужен жизненный цикл?
// A: ЖЦ позволяет нам отслеживать в каком состоянии находится экран пользователя
//    Зная жц мы можем очищать ссылки на неиспользуемые объекты, переживать изменение конфигурации

//    Примеры использования в приложении:
//    переживать изменение конфигурации,
//    запрос в сеть при попадании на экран,
//    сбрасывать запросы в onDestroy()
class MainActivity : AppCompatActivity(), BaseRouter {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.apply {
            btnTelegram.setOnClickListener { }
            btnTelegramConstraint.setOnClickListener { routeTo(ConstraintTelegramFragment.newInstance()) }

        }

    }


    override fun routeTo(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

}