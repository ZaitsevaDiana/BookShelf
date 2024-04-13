package com.example.bookshelf.ui.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bookshelf.data.Book
import com.example.bookshelf.ui.BooksUiState

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(
    booksUiState: BooksUiState,
    retryAction: () -> Unit,
    modifier: Modifier,
    onBookClicked: (Book)-> Unit
) {
    when (booksUiState) {
        is BooksUiState.Loading -> LoadingScreen(modifier)
        is BooksUiState.Success -> BooksGridScreen(
            books = booksUiState.bookSearch,
            modifier = modifier,
            onBookClicked
        )
        is BooksUiState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
}